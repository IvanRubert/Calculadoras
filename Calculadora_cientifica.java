import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Calculadora_cientifica {
	public static void main(String[] args) {
		String[] signos = {"+", "-", "*", "/", "^", "%", "√", "log10", "!", "sin", "cos", "tan", "salir"};
		
		String textnum2;
		double op1;
		String textnum= JOptionPane.showInputDialog("Introduce el primer operador");
		int signo = -1;

		if (Pattern.matches("[a-zA-Z]+", textnum) || textnum == null || textnum.length() == 0) {op1 = 0d;} else {op1 = Double.parseDouble(textnum);}
		
		while (signo != 12) {
			
			double op2 = 0;
			double result = 1;
			signo = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", null, 0, 3, null, signos, null);
			
			switch (signo) {
			case 0:
				textnum2 = JOptionPane.showInputDialog("Introduce el segundo operador");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+(op1+op2));
				op1 = op1+op2;
				continue;
			case 1:
				textnum2 = JOptionPane.showInputDialog("Introduce el segundo operador");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+(op1-op2));
				op1 = op1-op2;
				continue;
			case 2:
				textnum2 = JOptionPane.showInputDialog("Introduce el segundo operador");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+(op1*op2));
				op1 = op1*op2;
				continue;
			case 3:
				textnum2 = JOptionPane.showInputDialog("Introduce el segundo operador");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				if (op2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0","Error", 0);
				}else {
					JOptionPane.showMessageDialog(null, op1+" / "+op2+" = "+(op1/op2));
					op1 = op1/op2;
				}
				continue;
			case 4:
				textnum2 = JOptionPane.showInputDialog("Introduce el exponente");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				JOptionPane.showMessageDialog(null, op1+" ^ "+op2+" = "+Math.pow(op1, op2));
				op1 = Math.pow(op1,op2);
				continue;
			case 5:
				textnum2 = JOptionPane.showInputDialog("Introduce el segundo operador");
				if (Pattern.matches("[a-zA-Z]+", textnum2) || textnum2 == null || textnum2.length() == 0) {op2 = 0d;} else {op2 = Double.parseDouble(textnum2);}
				if (op2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede hacer el resto entre 0","Error", 0);
				}else {
					JOptionPane.showMessageDialog(null, op1+" % "+op2+" = "+(op1%op2));
					op1 = op1%op2;
				}
				continue;
			case 6:
				if (op1 < 0) {
					JOptionPane.showMessageDialog(null, "No se puede hacer la raíz cuadrada de un numero negativo","Error", 0);
				}else {
					JOptionPane.showMessageDialog(null, "√("+op1+") = "+Math.sqrt(op1));
					op1 = Math.sqrt(op1);
				}
				continue;
			case 7:
				if (op1 <= 0) {
					JOptionPane.showMessageDialog(null, "No se puede hacer el logaritmo de base 10 de un numero negativo o 0","Error", 0);
				}else {
					JOptionPane.showMessageDialog(null, "log("+op1+") = "+Math.log10(op1));
					op1 = Math.log10(op1);
				}
				continue;
			case 8:
				if (op1 == 0) {
					JOptionPane.showMessageDialog(null, op1+"! = 1");
					op1 = 1d;					
				}else if (op1 < 0) {
					JOptionPane.showMessageDialog(null, "No se puede hacer el factorial de un numero negativo","Error", 0);
				}else {
					int num = (int) op1;
					for (int i = 2; i <= num; i++) {
						result *= i;			
					}
					JOptionPane.showMessageDialog(null, num+"! = "+result);
					op1 = result;
				}
				continue;
			case 9:
				JOptionPane.showMessageDialog(null, "sin("+op1+") = "+Math.sin(op1));
				op1 = Math.sin(op1);
				continue;
			case 10:
				JOptionPane.showMessageDialog(null, "cos("+op1+") = "+Math.cos(op1));
				op1 = Math.cos(op1);
				continue;
			case 11:
				JOptionPane.showMessageDialog(null, "tan("+op1+") = "+Math.tan(op1));
				op1 = Math.tan(op1);
				continue;
			case 12:
				System.out.println("Has salido");
				continue;
			default:
				JOptionPane.showMessageDialog(null, "Signo erroneo", null, 0);
				continue;
			}
		}
		
		
	}
}

