import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		
	    double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro numero:"));

	    double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero:"));
	    
	    String opcao = JOptionPane.showInputDialog("Escolha a operação desejada:"
	    		+ "\n1 - Soma: "
	    		+ "\n2 - Subtração: "
	    		+ "\n3 - Multiplicação: "
	    		+ "\n4 - Divisão: ");
	    		
	    int opt = Integer.parseInt(opcao);
	    
	    if (opt == 1) {
	    Soma soma = new Soma();
	    
	    		JOptionPane.showMessageDialog(null,"O resultado da Soma dos números é: "+soma.calcular(numero1, numero2));
	    }
	    
	    if (opt == 2) {
	    
	    Subtracao sub = new Subtracao();
	    
	    		JOptionPane.showMessageDialog(null,"O resultado da Subtracao dos números é: "+sub.calcular(numero1, numero2));
	    }
	    
	    if (opt == 3) {
	    Multiplicacao mult = new Multiplicacao();
	    
	    		JOptionPane.showMessageDialog(null,"O resultado da Multilicação dos números é: "+mult.calcular(numero1, numero2));
	    
	    }
	    
	    if (opt == 4) {
	    Divisao div = new Divisao();
	    
	    		JOptionPane.showMessageDialog(null,"O resultado da Divisao dos números é: "+div.calcular(numero1, numero2));
	    }
	    

	}

}
