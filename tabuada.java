public class tabuada {
    public static void main(String[] args){
        int idades[] = new int[11];
        
        for(int i = 0; i < idades.length; i++){
            idades[i] = i*10;
        }
        //for(int i = 0; i < idades.length; i++){ //esse metodo tbm fuinciona
            //System.out.println(idades[i]); // esse metodo tamvem funciona
            for(int i:idades){
                System.out.println(i);
            }
        //} //fechando o metodo

    }
}
