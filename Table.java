import java.io.*;
import java.util.*;
import java.util.stream.*;

import java.lang.System.*;

public class Table
{
    /*  ATRIBUTOS DA CLASSE  */
    private List<List<String>> table;
    private List<String> header;

    /*  CONSTRUTORES  */
    // Recebe o caminho para um ficheiro csv, que é lido
    public Table(String path){
        this.table = readCSV(path);
        this.header = table.get(0);
    }

    /* Construir uma tabela baseada numa List<List<String>> */
    public Table(List<List<String>> table)
    {
        this.table = table;
        this.header = table.get(0);
    }

    /* Construtor cópia */
    public Table(Table other)
    {
        this.table = other.table;
        this.header = other.header;
    }
    
    public static void main(String[] args){
        /*Table tbl = new Table("/home/cristiano/Área de Trabalho/LFA/Pratica/proj/csvtable/CSV/example.csv");
        System.out.println(tbl.table.toString());
        System.out.println("\nHeader: \n" + tbl.header.toString());
        System.out.println("\nColuna 3 s/ header \n" + tbl.getColumn(3, false));
        System.out.println("\nColuna 3 c/ header \n" + tbl.getColumn(3, true));
        System.out.println("\nColuna 3 Unique: \n" + tbl.getUnique(3));
        System.out.println("\nColuna 1 e 2: \n" + tbl.subTableCol(1, 2));
        System.out.println("\nColuna 1 para a frente: \n" + tbl.subTableCol(1));
        System.out.println("\nLinha 1 para a frente: \n" + tbl.subTableRow(1));
        System.out.println("\nHeader: \n" + tbl.header);
        System.out.println("\nHeader Size: \n" + tbl.header.size());
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
    
        Table t3;
        System.out.println("\n(Tabela t2 + tbl)");
        t3 = t1.addTable(t2);
        t3.printTable();
}

    /*  LER FICHEIRO CSV  */
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
    
    /* Obter valor */
    public String getValue(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        return table.get(row).get(col);
    }

    /* Adicionar linha no fim */
    public void addRow(List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        table.add(l);
    }

    /* Adicionar linha num indice especifico */
    public void addRow(int idx, List<String> l)
    {
        assert l.size() > 0 && l.size() <= numColumns();
        assert idx > 0 && idx < numRows();
        table.add(idx, l);
    }

    /* Limpar uma linha da tabela */
    public void clearRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        for(int i = 0; i < numColumns(); i++)
            table.get(idx).set(i, "");
    }

    /* Remover uma linha */
    public void removeRow(int idx)
    {
        assert idx >= 0 && idx < numRows();
        table.remove(idx);
    }

    /* Adicionar coluna no fim */
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

    /* Adicionar coluna num indice especifico */
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

    /* Remover uma coluna */
    public void removeCol(int idx)
    {
        assert idx >= 0 && idx < numColumns();
        for(int i = 0; i < numRows(); i++)
            table.get(i).remove(idx);
    }

    /* Limpar um campo da tabela */
    public void clearField(int row, int col)
    {
        assert row >= 0 && row < numRows();
        assert col >= 0 && col < numColumns();
        table.get(row).set(col, "");
    }

    /* Tamanho da tabela (colunas, linhas) */
    public int numColumns()
    {
        return table.get(0).size();
    }

    public int numRows()
    {
        return table.size();
    }

    /* Obtém coluna c/valores não duplicados */
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

    /* Obter coluna com o índice "idx", c/ ou s/ header */
    public List<String> getColumn(int idx, boolean header)
    {
        assert idx >= 0 && idx < numColumns();
        List<String> tmp = new ArrayList<>();
        for(int i = (header) ? 0 : 1; i < table.size(); i++)
            tmp.add(getValue(i, idx));
        return tmp;
    }

    /* Obter linha com o índice "idx" */
    public List<String> getRow(int idx)
    {
        assert idx >= 0 && idx <= numRows();
        return table.get(idx);
    }

    /* Obter o indice da coluna pelo seu valor */
    public int getHeaderIndex(String s)
    {
        for(int i = 0; i < header.size(); i++){
            if(header.get(i).equals(s))
                return i;
        }
        return -1;
    }

    /* Devolve uma subtabela entre a coluna "startIdx" e "endIdx" (já trocada) */
    public List<List<String>> subTableCol(int startIdx, int endIdx)
    {
        assert startIdx >= 0 && startIdx <= endIdx;
        assert endIdx < table.get(0).size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /* Devolve uma subtabela entre a coluna "startIdx" e o fim (já trocada) */
    public List<List<String>> subTableCol(int startIdx)
    {
        assert startIdx >= 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numColumns(); i++)
            tmp.add(getColumn(i, true));
        
        return switchColRow(tmp);
    }

    /* Devolve uma subtabela entre a linha "startIdx" e "endIdx" */
    public List<List<String>> subTableRow(int startIdx, int endIdx)
    {
        assert startIdx >= 0;
        assert endIdx < table.size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /* Devolve uma subtabela entre a linha "startIdx" e o fim */
    public List<List<String>> subTableRow(int startIdx)
    {
        assert startIdx >= 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numRows(); i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /* "Transposta" da lista */
    public List<List<String>> switchColRow(List<List<String>> list)
    {
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = 0; i < list.get(0).size(); i++){
            List<String> tmpList = new ArrayList<>();
            for(List<String> row : list)
                tmpList.add(row.get(i));
            tmp.add(tmpList);
        }
        return tmp;
    }

    /* Soma de 2 tabelas */
    public Table addTable(Table b)
    {
        Table res;
        boolean bLarger = false;
       
        if(numColumns()*numRows() > b.numColumns()*b.numRows()){
            res = new Table(this);
        }
        else{
            res = new Table(b);
            bLarger = true;
        }

        if(bLarger)
        {
            //for(int i = 0; i < )
        }
        else{
            for(int i = 0; i < numColumns(); i++){
                for(int j = 0; j < b.numColumns(); j++){
                    /* verifica se os headers sao iguais */
                    if(b.getValue(0, j).equals(getValue(0, i))){
                        for(int k = 1; k < b.numRows(); k++){
                            List<String> tmpList = new ArrayList<String>(Collections.nCopies(numColumns(), ""));
                            tmpList.set(j, b.getValue(k, j));
                            res.addRow(tmpList);
                        }
                    }
                    else{
                        res.addCol(b.getColumn(j, true));
                        j++;
                    }
                }
            }
        }
        return res;
    }

    /* WIP */
    public void printTable(){
        /*System.out.println("Table");
        int i = 0;
        int[] max = new int[t.table.size()];
        Arrays.fill(max, Integer.MIN_VALUE);
        for(List<String> tmp : t.table){
            for(String tmpStr : tmp){
                if(tmpStr.length() > max[i])
                    max[i] = tmpStr.length();
            }
            i++;
        }

        for(List<String> tmp : t.table){
            for(String tmpStr : tmp){
                System.out.println(String.join("", Collections.nCopies((IntStream.of(max).sum() + t.table.size()), "-")));

            }
        }
        System.out.println("");
        return ;*/

        for(int i = 0; i < numRows(); i++)
        {
            System.out.println(getRow(i));
        }
    }


    /* Imprime as primeiras x linhas */
    public void head(int num)
    {

    }

    /* Imprime as ultimas x linhas */
    public void tail(int num)
    {

    }
}