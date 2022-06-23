public class ExercicioTemperaturas {
        public static void main(String[] args) {
            //Declaração e atribuição do vetor com os nomes das cidades;
            String[] cidade = {"Londres", "Madrid", "Nova York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
            //Declaração e atribuição da Matriz com as temperaturas mínimas e máximas
            int[][] temperatura = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

            //Inicialização de variáveis adicionais para guardar os dados filtrados
            String cidadeMinima = cidade[0], cidadeMaxima = cidade[0];
            int temperaturaMinima = temperatura[0][0];
            int temperaturaMaxima = temperatura[0][1];

            //Laço de repetição para encontrar a menor temperatura e a respectiva cidade
            for (int i = 0; i < temperatura.length; i++) {
                if (temperaturaMinima > temperatura[i][0]) {
                    temperaturaMinima = temperatura[i][0];
                    cidadeMinima = cidade[i];
                }
            }

            //Laço de repetição para encontrar a maior temperatura e a respectiva cidade
            for (int i = 0; i < temperatura.length; i++) {
                if (temperaturaMaxima < temperatura[i][1]) {
                    temperaturaMaxima = temperatura[i][1];
                    cidadeMaxima = cidade[i];
                }
            }

            //Mostrando os dados na console
            System.out.println("Cidade com menor temperatura: " + cidadeMinima + " - Temperatura = " + temperaturaMinima);
            System.out.println("Cidade com maior temperatura: " + cidadeMaxima + " - Temperatura = " + temperaturaMaxima);
        }


    }

