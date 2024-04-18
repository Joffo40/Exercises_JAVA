public class Array {
    public static void main(String[] args) {
        Integer[] list1 = {1,87,5,76,98,43};
        Integer[] list2 = {1,6,5,76,98,87};
        String chaine;
        System.out.println("Les elements suivants sont presents dans les 2 tableaux: \n");
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {   
                if (list1[i]==list2[j]) {
                    chaine = list1[i] + "\n";
                    System.out.println(chaine);
                    chaine="";
                }
            }  
        }
    }
}