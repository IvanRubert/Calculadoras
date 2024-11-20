import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] signos = {"+", "-", "*", "/", "^", "%", "√", "log10", "!", "sin", "cos", "tan", "salir"};
        double op1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer operador"));
        int signo = -1;

        while (signo != 12) {

            double op2 = 0;
            signo = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, signos, null);

            switch (signo) {
                case 0:
                    op1 = Operaciones.suma(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operador")));
                    break;
                case 1:
                    op1 = Operaciones.resta(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operador")));
                    break;
                case 2:
                    op1 = Operaciones.multiplicacion(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operador")));
                    break;
                case 3:
                    op1 = Operaciones.division(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operador")));
                    break;
                case 4:
                    op1 = Operaciones.potencia(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el exponente")));
                    break;
                case 5:
                    op1 = Operaciones.resto(op1, Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operador")));
                    break;
                case 6:
                    op1 = Operaciones.raizCuadrada(op1);
                    break;
                case 7:
                    op1 = Operaciones.log10(op1);
                    break;
                case 8:
                    op1 = Operaciones.factorial(op1);
                    break;
                case 9:
                    op1 = Operaciones.sin(op1);
                    break;
                case 10:
                    op1 = Operaciones.cos(op1);
                    break;
                case 11:
                    op1 = Operaciones.tan(op1);
                    break;
                case 12:
                    JOptionPane.showMessageDialog(null, "Has salido", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Signo erroneo", null, JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
