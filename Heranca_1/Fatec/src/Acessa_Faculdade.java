public class Acessa_Faculdade {

    public static void main(String agrs[]){
        Faculdade_CEETEPs ceetps = new Faculdade_CEETEPs();

        ceetps.setFatec("Fatec Baixada Santista");
        System.out.println("Fatec \t"+   ceetps.getFatec());

        Disciplinas_CEETEPs disciplinas = new Disciplinas_CEETEPs();

        disciplinas.setDisciplina("Programação Orientada a Objetos");
        System.out.println("disciplina \t"+   disciplinas.getDisciplina());
    }

}
