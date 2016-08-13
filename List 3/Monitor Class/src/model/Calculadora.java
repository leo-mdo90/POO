/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author BrunoRamos
 */
public class Calculadora {
    private String infix;
    private Stack<String> postfix;
    private Stack<String> operators;
    
    private final static String operatorList = "*/%+-^";
    
    public Calculadora() {
        postfix = new Stack<String>();
        operators = new Stack<String>();
    }
    
    /*
     * Operacoes
     */
    public double soma(double a, double b) {
        return a + b;
    }
    public double subtracao(double a, double b) {
        return a - b;
    }
    public double multiplicacao(double a, double b) {
        return a*b;
    }
    public double divisao(double a, double b) {
        return a/b;
    }
    public double potencia(double a, double b) {
        return Math.pow(a,b);
    }
    public double mod(double a, double b) {
        return a % b;
    }
    public boolean validaDivisao(double a, double b) {
        return (b!=0);
    }
    public boolean validaPotencia(double a, double b) {
        return ((b%1) == 0);
    }
    
    
    /*
     * Tratamento do input
     */
    public void setInfix(String infix) {
        this.infix = infix;
    }
    
    // Verifica se é operador
    public boolean isOperator(String c) {
        return (operatorList.indexOf(c) != -1);
    }
    // Verifica se é número
    public boolean isNumber(String c) {
        return c.matches("\\d"); // ou [0-9]
    }
    
    // Verifica precedencia
    public int precedence(String c) {
        if(c.equals("^"))
            return 30;
        else if (c.equals("/") || c.equals("*") || c.equals("%"))
            return 20;
        else if (c.equals("+") || c.equals("-"))
            return 10;
        return 0;
    }
    
    // Visualiza o topo da pilha
    private String seeTop() {
        if(!operators.empty())
            return operators.peek();
        else
            return null;
    }
    
    // Pop o topo da pilha
    private void popSeeTop() {
        if(!operators.empty())
            operators.pop();
    }
    
    // Infix -> Infix
    public void getPostfix() {
        infix = "(" + infix + ")";
        
        // Pega caractere por caractere
        for(int i=0,n=infix.length();i<n;i++) {
            String c = infix.substring(i,i+1);
            
            if(isNumber(c)) // Se for numero, adiciona para a pilha
                postfix.push(c);
            
            else if (c.equals("(")) // Se for parenteses, adiciona na pilha de operadores
                operators.push(c);
            
            else if (c.equals(")")) { // Se fechou parenteses, limpa pilha de operadores
                String oper;
                while(!(oper = seeTop()).equals("(")) {
                    postfix.push(oper);
                    popSeeTop();
                }
            } else { // Verifica precedencia
                while(precedence(c) <= precedence(seeTop())) {
                    postfix.push(seeTop());
                    popSeeTop();
                }
                operators.push(c);
            }   
        }
    }
    
    // Calcula o que estiver na pilha do postfix
    public String evaluatePostFix() {
        Stack<Double> eval = new Stack<Double>();
        while(!postfix.isEmpty()) {
            String c = postfix.get(0);
            if(c.matches("\\d"))
                eval.push(Double.parseDouble(c));
            else {
                double a, b;
                a = eval.pop();
                b = eval.pop();
                switch(c) {
                    case "+":
                        eval.push(soma(a,b));
                        break;
                    case "-":
                        eval.push(subtracao(b,a));
                        break;
                    case "*":
                        eval.push(multiplicacao(a,b));
                        break;
                    case "/":
                        if(validaDivisao(b,a))
                            eval.push(divisao(b,a));
                        else
                            return "ERROR";
                        break;
                    case "^":
                        if(validaPotencia(b,a))
                            eval.push(potencia(b,a));
                        else
                            return "ERROR";
                        break;
                    case "%":
                        eval.push(mod(b,a));
                        break;
                    default:
                        return "ERROR";
                }
            }
            postfix.remove(0);
        }
        return Double.toString(eval.pop());
    }
    
    
    public String processInput() {
        getPostfix();
        String result = evaluatePostFix();
        
        return result;
    }
}
