public class Prefeitura {

    public static void main(String[] args) {
        Regiao_de_Santos r = new Regiao_de_Santos();
        Bairro_de_Santos b = new Bairro_de_Santos();
        Cidade_de_Santos c = new Cidade_de_Santos();

        /*classe de hierarquia mais inferior dá acesso a todos os atributos */

        b.setBairro("Jardim Radio Clube");
        b.setRegiao("Zona Noroeste");
        b.setRua("Alvaro Guimaraes");
        b.setPopulacao(100000);

        System.out.println("Bairro: " + b.getBairro());
        System.out.println("Regiao: " + b.getRegiao());
        System.out.println("Rua: " + b.getRua());
        System.out.println("População: " + b.getPopulacao());

        /*Não dá acesso aos atributos da classe inferior*/

        r.setRegiao("Zona Leste");
        r.setBairro("Marapé");
        r.setPopulacao(99000);

        System.out.println("Bairro: " + r.getBairro());
        System.out.println("Regiao: " + r.getRegiao());
        System.out.println("População: " + r.getPopulacao());

        c.setRegiao("Região Central");
        c.setPopulacao(20000);
        
        System.out.println("Região: " + c.getRegiao());
        System.out.println("População: " + c.getPopulacao());
    }

}
