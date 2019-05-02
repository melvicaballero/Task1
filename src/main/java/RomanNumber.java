/*
 * @(#) RomanNumber.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

/**
 * ControllerConvert.
 * @version 0.0.1
 * @author Melvi Caballero.
 */

public class RomanNumber {

    /**
     * Method romanValue return the numerical value of a single roman number.
     * @param roman like a String value.
     * @return return cero for default and a digit if the value is found.
     */
    public static int romanValue(char roman) {
        int result = 0;
        switch (roman) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    /**
     * Method invalidRomanVLD verify if is a invalid roman value for V, L, and D.
     * @param romano like a String value.
     * @return return cero is the roman value is invalid and one if is valid.
     */
    public int invalidRomanVLD(String romano) {
        int contadorV = 0;
        int contadorL = 0;
        int contadorD = 0;
        char anterior = ' ';
        for (int i = 0; i < romano.length(); i++) {
            if (romano.charAt(i) == 'V') {
                contadorV++;
            }
            if (romano.charAt(i) == 'L') {
                contadorL++;
            }
            if (romano.charAt(i) == 'D') {
                contadorD++;
            }
        }
        if (contadorV > 1 || contadorL > 1 || contadorD > 1) {
            return 0;
        }
         else
             return 1;
    }

    /**
     * Method invalidRomanIXCM for I, X, C, and M.
     * @param romano like a String value.
     * @return return cero is the roman value is invalid and one if is valid.
     */
    public int invalidRomanIXCM(String romano){
        int contador = 0;
        char anterior = ' ';
        for(int i=0; i<romano.length(); i++){
            if (romano.charAt(i) == anterior){
                contador++;
            }
            else {
                contador = 1;
                anterior = romano.charAt(i) ;
            }
            if (contador>3){
                return 0;
            }
            if((anterior=='V' || anterior=='L' || anterior=='D') && contador>1){
                return 0;
            }
            if (i<romano.length()-1) {
                if (contador == 3 && romanValue(anterior) < romanValue(romano.charAt(i + 1))) {
                    return 0;
                }
                if (romanValue(anterior) == (romanValue(romano.charAt(i+1))/2))
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    /**
     * Method Convert will do a convertion of a string with a roman value an return a numerical value.
     * @param romano like a string with a roman value.
     * @return the numerical value.
     */
    public int convert(String romano){
        if (invalidRomanIXCM(romano)==0 || invalidRomanVLD(romano)==0){
            return 0;
        }
        int num = 0;
        int bandera = 0;
        if (romano.length() == 1){
            return (romanValue(romano.charAt(0)));
        }
        else {
            for (int i=romano.length()-1; i>=1;i--){
                if (romano.length()-1 == i){
                    num = romanValue(romano.charAt(i));
                }
                if (romanValue(romano.charAt(i)) > romanValue(romano.charAt(i - 1))) {
                    num -= romanValue(romano.charAt(i - 1));
                } else {
                    num += romanValue(romano.charAt(i - 1));
                }

            }
            return (num);
        }
    }
  }
