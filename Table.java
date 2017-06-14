import java.io.*;
import java.util.*;
import java.util.stream.*;

import java.lang.System.*;


/**
* <h1>Classe Table</h1>
* Classe que implementa uma Tabela e respectivas operações
* de manipulação da mesma, em colunas, linhas ou mesmo a
* tabela completa.
* <p>
* Ficheiro faz parte do Trabalho Prático de Linguagens Formais
* e Autómatos, do curso de Eng. de Computadores e Telemática
* da Universidade de Aveiro.
* <p>
* 
*
* @author  Cristiano Vagos (cristianovagos@ua.pt), Paulo Gil (paulogil@ua.pt)
* @version 1.0
* @since   2017-06-14 
*/

public class Table
{
    /**  
    * A Tabela propriamente dita.
    */
    private List<List<String>> table;

    /**
    * Cria uma Tabela a partir de um caminho para um 
    * ficheiro CSV.
    * @param path Caminho absoluto para o ficheiro CSV
    */
    public Table(String path){
        this.table = readCSV(path);
    }

    /**
    * Cria uma Tabela a partir de uma outra Tabela 
    * (objecto) já existente.
    * @param other Tabela já existente
    */
    public Table(Table other)
    {
        this.table = other.table;
    }
    
    /**
    * Função principal.
    * Usada para testes das funcionalidades.
    * @param args Sequência de argumentos aquando da execução do ficheiro 
    */
    public static void main(String[] args){
        /*Table tbl = new Table("/home/cristiano/Área de Trabalho/LFA/Pratica/proj/csvtable/CSV/example.csv");
        System.out.println(tbl.table.toString());
        System.out.println("\nColuna 3 s/ header \n" + tbl.getColumn(3, false));
        System.out.println("\nColuna 3 c/ header \n" + tbl.getColumn(3, true));
        System.out.println("\nColuna 3 Unique: \n" + tbl.getUnique(3));
        System.out.println("\nColuna 1 e 2: \n" + tbl.subTableCol(1, 2));
        System.out.println("\nColuna 1 para a frente: \n" + tbl.subTableCol(1));
        System.out.println("\nLinha 1 para a frente: \n" + tbl.subTableRow(1));
        System.out.println("\nColuna 1 para a frente: \n" + tbl.subTableCol(1));
        System.out.println("\nLinha 1: \n" + tbl.getRow(1));
        System.out.println("\nLinha 2: \n" + tbl.getRow(2));
        
        System.out.println("\n(Adicionar Linha 1 no fim)");
        tbl.addRow(tbl.getRow(1));
        
        System.out.println("\nUltima linha: \n" + tbl.getRow(tbl.numRows()-1));

        printTable(tbl);

        System.out.println("\n(Adicionar coluna 1 à tabela)");
        tbl.addCol(tbl.getColumn(1, false));

        System.out.println("\n(Tabela tbl)");
        printTable(tbl);

        Table t2 = new Table(tbl);
        t2.addCol(tbl.getColumn(3, true));
        t2.removeRow(2);
        t2.removeCol(0);
        t2.removeCol(1);

        System.out.println("\n(Tabela t2)");
        printTable(t2);

        System.out.println("\n(Tabela t2 + tbl)");
        printTable(t2.addTable(tbl));*/

        Table t1 = new Table("/home/cristiano/Área de Trabalho/LFA/Pratica/proj/csvtable/CSV/csv1.csv");
        Table t2 = new Table("/home/cristiano/Área de Trabalho/LFA/Pratica/proj/csvtable/CSV/csv2.csv");
        
        System.out.println("\n(Tabela t1)");
        t1.printTable();

        System.out.println("\n(Tabela t2)");
        t2.printTable();
    
        List<String> col = t1.getColumn(0, true);
        

        Table t3;
        System.out.println("\n(Tabela t2 - t1)");
        t3 = t2.subTable(t2);
        t3.printTable();

        System.out.println("\n(Tabela t2 == t2)");
        System.out.println(t2.isEqual(t2));

        System.out.println("\n(Maximo da coluna 0 da coluna 1)");
        System.out.println(t1.max(t1.getColumn(0, true)));

        System.out.println("\n(Mínimo da coluna 0 da tabela 1)");
        System.out.println(t1.min(t1.getColumn(0, true)));

        System.out.println("\n(Soma da coluna 0 da tabela 1)");
        System.out.println(t1.sum(t1.getColumn(0, false)));

        System.out.println("\n(Média da coluna 0 da tabela 1)");
        System.out.println(t1.avg(t1.getColumn(0, false)));

        Table tAux = new Table(t1);

        System.out.println("\nTabela t1 ordenada ascendente");
        t1.sort();
        t1.printTable();

        System.out.println("\nTabela t1 ordenada descendente");
        tAux.sortDesc();
        tAux.printTable();
    }

    /**
    * Função que irá fazer o parse do ficheiro dado
    * por argumento.
    * @param path Caminho absoluto para o ficheiro CSV
    * @return Uma lista de listas, com os dados retirados do ficheiro
    */
    public List<List<String>> readCSV(String path){
        List<List<String>> table = new ArrayList<List<String>>();
        List<String> row = new ArrayList<String>();
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while((line = br.readLine()) != null){
                // PARSING
                String[] tmp = line.split(",");
                row = Arrays.asList(tmp);
                table.add(row);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return table;
    }

    /**
    * Modificar um valor específico da tabela.
    * @param row Linha da Tabela
    * @param col Coluna da Tabela
    * @param value O novo valor
    */
    public void setValue(int row, int col, String value)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        table.get(row).set(col, value);
    }
    
    /**
    * Obter um valor específico da tabela.
    * @param row Linha da Tabela
    * @param col Coluna da Tabela
    * @return O valor, dado a linha e a coluna 
    */
    public String getValue(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        return table.get(row).get(col);
    }

    /**
    * Adiciona uma linha no fim da Tabela, dado uma
    * lista com o conteúdo a ser guardado
    * @param l Lista com o conteúdo a ser colocado.
    */
    public void addRow(List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        table.add(l);
    }

    /**
    * Adiciona uma linha no índice da linha dado, 
    * dado uma lista com o conteúdo a ser guardado.
    * Não substitui a linha anterior, esta passa para baixo.  
    * @param idx Índice da linha
    * @param l Lista com o conteúdo a ser colocado.
    */
    public void addRow(int idx, List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        assert idx > 0 && idx < numRows();
        table.add(idx, l);
    }

    /**
    * Limpa a linha dada.
    * @param idx Índice da linha
    */
    public void clearRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        for(int i = 0; i < numColumns(); i++)
            table.get(idx).set(i, "");
    }

    /**
    * Apaga a linha dada.
    * @param idx Índice da linha
    */
    public void removeRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        table.remove(idx);
    }

    /**
    * Adiciona uma coluna à direita da última existente 
    * dado uma lista com o conteúdo a ser guardado.
    * @param l Lista com o conteúdo a ser colocado.
    */
    public void addCol(List<String> l)
    {
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(l.get(i));
            else
                tmp.add("");
            table.set(i, tmp);
        }
    }

    /**
    * Adiciona uma coluna no índice da coluna dado, 
    * dado uma lista com o conteúdo a ser guardado.
    * Não substitui a coluna anterior, esta passa para baixo.  
    * @param idx Índice da coluna
    * @param l Lista com o conteúdo a ser colocado.
    */
    public void addCol(int idx, List<String> l)
    {
        assert idx >= 0 && idx < numColumns();
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            if(i < l.size())
                tmp.add(idx, l.get(i));
            else
                tmp.add(idx, "");
            table.set(i, tmp);
        }
    }

    /**
    * Apaga uma coluna.
    * @param idx Índice da coluna
    */
    public void removeCol(int idx)
    {
        assert idx >= 0 && idx < numColumns();
        for(int i = 0; i < numRows(); i++){
            List<String> tmp = new ArrayList<>(table.get(i));
            tmp.remove(idx);
            table.set(i, tmp);
        }
    }

    /**
    * Limpa um campo da tabela.
    * @param row Índice da linha
    * @param col Índice da coluna
    */
    public void clearField(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        table.get(row).set(col, "");
    }

    /**
    * Obtém o número de colunas da tabela
    * @return Número de colunas da tabela.
    */
    public int numColumns()
    {
        return table.get(0).size();
    }

    /**
    * Obtém o número de linhas da tabela
    * @return Número de linhas da tabela.
    */
    public int numRows()
    {
        return table.size();
    }

    /**
    * Obtém uma coluna dada, sem valores repetidos.
    * @param idx Índice da coluna
    * @return A coluna sem valores repetidos
    */
    public List<String> getUnique(int idx)
    {
        assert idx >= 0 && idx < numColumns();
        List<String> res = new ArrayList<>(), tmp = getColumn(idx, false);
        Set<String> tmpSet = new LinkedHashSet<>();

        for(int i = 0; i < tmp.size(); i++)
            tmpSet.add(tmp.get(i));
        
        res.addAll(tmpSet);
        return res;
    }

    /**
    * Obter uma coluna dada, com ou sem o
    * header (primeira linha).
    * @param idx Índice da coluna
    * @param header Com (true) ou sem (false) o header
    * @return A coluna dada com ou sem o header
    */
    public List<String> getColumn(int idx, boolean header)
    {
        assert idx >= 0 && idx < numColumns();
        List<String> tmp = new ArrayList<>();
        for(int i = (header) ? 0 : 1; i < table.size(); i++)
            tmp.add(getValue(i, idx));
        return tmp;
    }

    /**
    * Obter uma linha dada um índice.
    * @param idx Índice da linha
    * @return A linha no índice dado
    */
    public List<String> getRow(int idx)
    {
        assert idx >= 0 && idx <= numRows();
        return table.get(idx);
    }

    /**
    * Obtém o índice da coluna dado o valor do header.
    * @param s Valor a ser procurado
    * @return Índice da coluna onde está o valor
    */
    public int getHeaderIndex(String s)
    {
        for(int i = 0; i < numColumns(); i++){
            if(table.get(0).get(i).equals(s))
                return i;
        }
        return -1;
    }

    /**
    * Obter uma sub-tabela entre duas colunas
    * @param startIdx Índice inicial
    * @param endIdx Índice final (inclusive)
    * @return A sub-tabela
    */
    public List<List<String>> subTableCol(int startIdx, int endIdx)
    {
        assert startIdx >= 0 && startIdx <= endIdx;
        assert endIdx < table.get(0).size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /**
    * Obter uma sub-tabela a partir de uma coluna
    * @param startIdx Índice inicial
    * @return A sub-tabela
    */
    public List<List<String>> subTableCol(int startIdx)
    {
        assert table != null;
        assert startIdx >= 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numColumns(); i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /**
    * Obter uma sub-tabela entre duas linhas
    * @param startIdx Índice inicial
    * @param endIdx Índice final (inclusive)
    * @return A sub-tabela
    */
    public List<List<String>> subTableRow(int startIdx, int endIdx)
    {
        assert table != null;
        assert startIdx >= 0;
        assert endIdx < table.size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /**
    * Obter uma sub-tabela a partir de uma linha
    * @param startIdx Índice inicial
    * @return A sub-tabela
    */
    public List<List<String>> subTableRow(int startIdx)
    {
        assert table != null;
        assert startIdx >= 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numRows(); i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /**
    * Obter uma tabela transposta, isto é, trocar
    * as linhas com as colunas
    * @param list A tabela
    * @return A tabela já modificada
    */
    public List<List<String>> switchColRow(List<List<String>> list)
    {
        assert table != null;
        assert list != null;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = 0; i < list.get(0).size(); i++){
            List<String> tmpList = new ArrayList<>();
            for(List<String> row : list)
                tmpList.add(row.get(i));
            tmp.add(tmpList);
        }
        return tmp;
    }

    /**
    * Soma entre duas tabelas
    * (junta as colunas das duas tabelas)
    * @param t A tabela a ser somada
    * @return Uma tabela resultante da operação
    */
    public Table addTable(Table t)
    {
        assert table != null;
        assert t != null;
        Table res = new Table(this);
        for(int i = 0; i < t.numColumns(); i++){
            res.addCol(t.getColumn(i, true));
        }
        return res;
    }

    /**
    * Subtração entre duas tabelas
    * (remove colunas caso o header seja igual)
    * @param t A tabela a ser subtraída
    * @return Uma tabela resultante da operação
    */
    public Table subTable(Table t)
    {
        assert table != null;
        assert t != null;
        Table res = new Table(this);
        for(int i = 0; i < numColumns(); i++){
            for(int j = 0; j < t.numColumns(); j++){
                if(getColumn(i,true).equals(t.getColumn(j,true))){
                    res.removeCol(i);
                }
            }
        }
        return res;
    }

    /**
    * Ordena as linhas da Tabela (ascendente)
    */
    public void sort()
    {
        assert table != null;
        for(int i = 0; i < numRows(); i++)
            Collections.sort(getRow(i));
    }

    /**
    * Ordena as linhas da Tabela (descendente)
    */
    public void sortDesc()
    {
        assert table != null;
        for(int i = 0; i < numRows(); i++){
            Collections.sort(getRow(i));
            Collections.reverse(getRow(i));
        }
    }

    /**
    * Verifica se duas tabelas são iguais
    * @param t Tabela a ser comparada
    * @return Resultado (verdadeiro/falso)
    */
    public boolean isEqual(Table t)
    {
        assert t != null;
        return table.containsAll(t.table);
    }

    /**
    * Exporta a tabela para um ficheiro CSV a ser criado
    * na pasta onde está este ficheiro
    * @param filename Nome do ficheiro CSV
    */
    public void export(String filename)
    {
        assert filename.length() > 0;
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new File(filename + ".csv"));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows(); i++){
            for(int j = 0; j < numColumns(); j++){
                sb.append(getValue(i, j));
                
                if(j < numColumns()-1)
                    sb.append(",");
            }
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();
    }

    /**
    * Imprime a tabela
    */
    public void printTable()
    {
        for(int i = 0; i < numRows(); i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Imprime as primeiras "n" linhas
    * @param num Número de linhas
    */
    public void head(int num)
    {
        assert num > 0 && num < numRows();
        for(int i = 0; i < num; i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Imprime as últimas "n" linhas
    * @param num Número de linhas
    */
    public void tail(int num)
    {
        assert num >= 0 && num < numRows();
        for(int i = num; i < numRows(); i++){
            System.out.println(getRow(i));
        }
    }

    /**
    * Obtém o valor máximo de uma lista (linha / coluna)
    * @param list Lista
    * @return O valor máximo da lista
    */
    public Double max(List<String> list)
    {
        assert list.size() > 0;
        Double aux, max;
        try {
            max = Double.parseDouble(list.get(1));
            for(int i = 1; i < list.size(); i++){
                aux = Double.parseDouble(list.get(i));
                max = aux > max ? aux : max;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return max;
    }

    /**
    * Obtém o valor mínimo de uma lista (linha / coluna)
    * @param list Lista
    * @return O valor mínimo da lista
    */
    public Double min(List<String> list)
    {
        assert list.size() > 0;
        Double aux, min;
        try {
            min = Double.parseDouble(list.get(1));
            for(int i = 1; i < list.size(); i++){
                aux = Double.parseDouble(list.get(i));
                min = aux < min ? aux : min;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return min;
    }

    /**
    * Obtém o valor da soma de uma lista (linha / coluna)
    * @param list Lista
    * @return O valor da soma da lista
    */
    public Double sum(List<String> list)
    {
        assert list.size() > 0;
        Double sum = 0.0;
        try {
            for(int i = 0; i < list.size(); i++){
                sum += Double.parseDouble(list.get(i));
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return sum;
    }

    /**
    * Obtém o valor da média de uma lista (linha / coluna)
    * @param list Lista
    * @return O valor da média da lista
    */
    public Double avg(List<String> list)
    {
        assert list.size() > 0;
        Double sum = 0.0;
        int aux = 0;
        try {
            for(int i = 0; i < list.size(); i++){
                sum += Double.parseDouble(list.get(i));
                aux++;
            }
        }
        catch (NumberFormatException e){
            return null;
        }
        return sum/aux;
    }
}