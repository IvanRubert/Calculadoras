import javax.swing.*;

public class Operaciones {
    public static double suma(double op1, double op2) {
        JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+(op1+op2));
        return op1+op2;
    }

    public static double resta(double op1, double op2) {
        JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+(op1-op2));
        return op1-op2;
    }

public static double multiplicacion(double op1, double op2) {
    JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+(op1*op2));
    return op1*op2;
    }

    public static double division(double dividendo, double divisor) {
        if (divisor == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0","Error", JOptionPane.ERROR_MESSAGE);
            return dividendo;
        }else {
            JOptionPane.showMessageDialog(null, dividendo+" / "+divisor+" = "+(dividendo/divisor));
            return dividendo/divisor;
        }
    }

    public static double potencia(double base, double exp) {
        JOptionPane.showMessageDialog(null, base+" ^ "+exp+" = "+Math.pow(base, exp));
        return Math.pow(base,exp);
    }

    public static double resto(double dividendo, double divisor) {
        if (divisor == 0) {
            JOptionPane.showMessageDialog(null, "No se puede hacer el resto entre 0","Error", JOptionPane.ERROR_MESSAGE);
            return dividendo;
        }else {
            JOptionPane.showMessageDialog(null, dividendo+" % "+divisor+" = "+(dividendo%divisor));
            return dividendo%divisor;
        }
    }

    public static double raizCuadrada(double op1) {
        if (op1 < 0) {
            JOptionPane.showMessageDialog(null, "No se puede hacer la raíz cuadrada de un numero negativo","Error", JOptionPane.ERROR_MESSAGE);
            return op1;
        }else {
            JOptionPane.showMessageDialog(null, "√("+op1+") = "+Math.sqrt(op1));
            return Math.sqrt(op1);
        }
    }

    public static double log10(double op1) {
        if (op1 <= 0) {
            JOptionPane.showMessageDialog(null, "No se puede hacer el logaritmo de base 10 de un numero negativo o 0","Error", JOptionPane.ERROR_MESSAGE);
            return op1;
        }else {
            JOptionPane.showMessageDialog(null, "log("+op1+") = "+Math.log10(op1));
            return Math.log10(op1);
        }
    }

    public static double factorial(double op1) {
        double result = 1;
        if (op1 == 0) {
            JOptionPane.showMessageDialog(null, op1+"! = 1");
            return 1d;
        }else if (op1 < 0) {
            JOptionPane.showMessageDialog(null, "No se puede hacer el factorial de un numero negativo","Error", JOptionPane.ERROR_MESSAGE);
            return op1;
        }else {
            int num = (int) op1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            JOptionPane.showMessageDialog(null, num+"! = "+result);
            return result;
        }
    }

    public static double sin(double op1) {
        JOptionPane.showMessageDialog(null, "sin("+op1+") = "+Math.sin(op1));
        return Math.sin(op1);
    }

    public static double cos(double op1) {
        JOptionPane.showMessageDialog(null, "cos("+op1+") = "+Math.cos(op1));
        return Math.cos(op1);
    }

    public static double tan(double op1) {
        JOptionPane.showMessageDialog(null, "tan("+op1+") = "+Math.tan(op1));
        return Math.tan(op1);
    }
}
