public class ExercicioTemperaturas {
        public static void main(String[] args) {
            //Declaração e atribuição do vetor com os nomes das cidades;
            String cidades[] = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};

            //Declaração e atribuição da Matriz com as temperaturas mínimas e máximas
            int[][] temperaturaCidades = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

            //Inicialização de variáveis adicionais para guardar os dados filtrados
            String cidadeTempMinima = cidades[0];
            String cidadeTempMaxima = cidades[0];
            int temperaturaMinima = temperaturaCidades[0][0];
            int temperaturaMaxima = temperaturaCidades[0][1];

            //Laço de repetição para encontrar a menor temperatura e a respectiva cidade e a maior temperatura e a respectiva cidade
            for (int i = 0; i < temperaturaCidades.length; i++) {
                if (temperaturaMinima > temperaturaCidades[i][0]) {
                    temperaturaMinima = temperaturaCidades[i][0];
                    cidadeTempMinima = cidades[i];
                }
                if (temperaturaMaxima < temperaturaCidades[i][1]) {
                    temperaturaMaxima = temperaturaCidades[i][1];
                    cidadeTempMaxima = cidades[i];
                }
            }

            //Mostrando os dados na console
            System.out.println("Cidade com menor temperatura: " + cidadeTempMinima + " = " +temperaturaMinima+ " graus");
            System.out.println("Cidade com maior temperatura: " + cidadeTempMaxima + " = " +temperaturaMaxima+ " graus");
        }


    }

