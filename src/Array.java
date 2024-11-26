import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] nomes = {"Carlos-M", "Mariana-F", "Leticia-F", "Andre-M", "Lucas-M"};

        String[] masculino = new String[nomes.length];
        String[] feminino = new String[nomes.length];
        int masculinoCount = 0;
        int femininoCount = 0;

        for (String nome : nomes) {
            String[] partes = nome.split("-");
            String nomePessoa = partes[0];
            String sexo = partes[1];

            if (sexo.equalsIgnoreCase("M")) {
                masculino[masculinoCount++] = nomePessoa;
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino[femininoCount++] = nomePessoa;
            }
        }

        // Redimensionar os arrays para o tamanho correto
        masculino = Arrays.copyOf(masculino, masculinoCount);
        feminino = Arrays.copyOf(feminino, femininoCount);

        System.out.println("Array Masculino: " + Arrays.toString(masculino));
        System.out.println("Array Feminino: " + Arrays.toString(feminino));
    }
}
