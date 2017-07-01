public class TableOutput {
    public static void main(String[] args){
         int dummy;
         dummy = 3;
         System.out.println(dummy);
         String str;
         str = "Cristiano";
         System.out.println(str);
         Table tabela;
         tabela = new Table("example.csv");
         tabela.printTable();
         tabela.removeRow(2);
         tabela.printTable(); 
    }
}