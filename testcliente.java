
public class testcliente {
    public static void main (String[] args){
        cliente jose = new cliente("José", "123.123.123-12");
        cliente maria = new cliente("Maria", 160.60f);
        cliente fernando = new cliente("Fernando", "123.321.456- 78", 25,  260.30f);


        System.out.println(jose.getNome());
        System.out.println(jose.getCpf());
        System.out.println(maria.getSaldo());
        System.out.println(maria.getNome());
        System.out.println(fernando.getNome());
        System.out.println(fernando.getCpf());

    }
}
