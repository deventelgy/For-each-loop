public class Main {
    public static void main(String[] args)
    {
        float[] valores ={10.0f, 20.0f, 30.0f};
        float suma = 0.0f;

        for(float corredor:valores){
            suma += corredor;
        }
        System.out.println(suma);
    }
}