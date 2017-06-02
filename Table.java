import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.lang.System.*;

public class Table
{
    /*  ATRIBUTOS DA CLASSE  */
    private static List<List<String>> table;
    private List<String> header;

    /*  CONSTRUTORES  */
    // Recebe o caminho para um ficheiro csv, que é lido
    public Table(String path){
        this.table = readCSV(path);
        this.header = this.table.get(0);
    }

    /* Construtor cópia */
    public Table(Table other)
    {
        this.table = other.table;
        this.header = other.header;
    }
    
    public static void main(String[] args){
        Table tbl = new Table("/home/cristiano/Área de Trabalho/LFA/Pratica/proj/csvtable/CSV/example.csv");
        /*System.out.println(tbl.table.toString());
        System.out.println("Header: \n" + tbl.header.toString());
        System.out.println("Coluna 3 s/ header \n" + tbl.getColumn(3, false));
        System.out.println("Coluna 3 c/ header \n" + tbl.getColumn(3, true));
        System.out.println("Coluna 3 Unique: \n" + tbl.getUnique(3));
        System.out.println("Coluna 1 e 2: \n" + tbl.subTableCol(1, 2));
        System.out.println("Coluna 1 para a frente: \n" + tbl.subTableCol(1));
        System.out.println("Linha 1 para a frente: \n" + tbl.subTableRow(1));
        System.out.println("Header: \n" + tbl.header);*/
    }

    /*  LER FICHEIRO CSV  */
    public static List<List<String>> readCSV(String path){
        List<List<String>> table = new ArrayList<List<String>>();
        List<String> row = new ArrayList<>();
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

    /* Adicionar linha no fim */
    public void addRow(List<String> l)
    {
        table.add(l);
    }

    /* Adicionar linha num indice especifico */
    public void addRow(int idx, List<String> l)
    {
        table.add(idx, l);
    }

    /* Remover uma linha da tabela */
    public void removeRow(int idx)
    {
        List<String> tmp = table.get(idx);
        for(int i = 0; i < tmp.size(); i++)
            tmp.set(i, "");
    }

    /* Remover um campo da tabela */
    public void removeField(int row, int col)
    {
        List<String> tmp = table.get(row);
        tmp.set(col, "");
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
        List<String> tmp = new ArrayList<>();
        for(int i = (header) ? 1 : 0; i < table.size(); i++)
            tmp.add(table.get(i).get(idx));
        return tmp;
    }

    /* Obter linha com o índice "idx" */
    public List<String> getRow(int idx)
    {
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

    /* Devolve uma subtabela entre a coluna "startIdx" e "endIdx" */
    public List<List<String>> subTableCol(int startIdx, int endIdx)
    {
        assert startIdx > 0 && startIdx <= endIdx;
        assert endIdx < table.get(0).size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getColumn(i, true));
        
        return tmp;
    }

    /* Devolve uma subtabela entre a coluna "startIdx" e o fim */
    public List<List<String>> subTableCol(int startIdx)
    {
        assert startIdx > 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numColumns(); i++)
            tmp.add(getColumn(i, true));
        
        return tmp;
    }

    /* Devolve uma subtabela entre a linha "startIdx" e "endIdx" */
    public List<List<String>> subTableRow(int startIdx, int endIdx)
    {
        assert startIdx > 0;
        assert endIdx < table.size();
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i <= endIdx; i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /* Devolve uma subtabela entre a linha "startIdx" e o fim */
    public List<List<String>> subTableRow(int startIdx)
    {
        assert startIdx > 0;
        List<List<String>> tmp = new ArrayList<List<String>>();
        for(int i = startIdx; i < numRows(); i++)
            tmp.add(getRow(i));

        return tmp;
    }

    /* WIP */
    public static void printTable(Table t){
        System.out.println("Table");
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
        return ;
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