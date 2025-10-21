public class ArattaiGrowthTracker {
    public static void main(String[] args) {

        System.out.println("Arattai Growth");
        

        
        int[] downloadsDiarios = {850000, 1050000, 1100000, 950000, 1200000, 1000000, 850000};
        String[] diasDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        
        int totalDownloads = 0;
        for (int i = 0; i < downloadsDiarios.length; i++) {
            totalDownloads = totalDownloads + downloadsDiarios[i];
        }

        System.out.println("Total de Downloads na Semana: " + totalDownloads);
        

        
        int pico = downloadsDiarios[0];
        int minimo = downloadsDiarios[0];
        String diaPico = diasDaSemana[0];
        String diaMinimo = diasDaSemana[0];

        for (int i = 1; i < downloadsDiarios.length; i++) {
            if (downloadsDiarios[i] > pico) {
                pico = downloadsDiarios[i];
                diaPico = diasDaSemana[i];
            }
            if (downloadsDiarios[i] < minimo) {
                minimo = downloadsDiarios[i];
                diaMinimo = diasDaSemana[i];
            }
        }

        System.out.println("Análise de Extremos:");
        System.out.println("Dia de Pico de Downloads: " + diaPico + " com " + pico + " downloads.");
        System.out.println("Dia de Minimo de Downloads: " + diaMinimo + " com " + minimo + " downloads.");
        

        
        int metaDiaria = 1000000;
        int diasAcimaDaMeta = 0;

        System.out.println("Análise de Metas (Meta Diária: " + metaDiaria + "):");

        int i = 0;
        while (i < downloadsDiarios.length) {
            if (downloadsDiarios[i] > metaDiaria) {
                System.out.println("  > " + diasDaSemana[i] + ": Atingiu (" + downloadsDiarios[i] + " downloads)");
                diasAcimaDaMeta = diasAcimaDaMeta + 1;
            } else {
                System.out.println("  > " + diasDaSemana[i] + ": Nao Atingiu. (" + downloadsDiarios[i] + " downloads)");
            }
            i = i + 1;
        }

        System.out.println();
        System.out.println("O Arattai Growt superou a meta diária em " + diasAcimaDaMeta + " dias esta semana.");
        
    }
}
