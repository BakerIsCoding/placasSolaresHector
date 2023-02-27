/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.endollssolars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Baker
 */
public class EndollsSolars {

    public static void main(String[] args) throws IOException {
        boolean programDone = false;
        BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Casa> allCasas = new ArrayList<>();

        // do while programDone sea diferente a true
        do {
            System.out.print("> ");
            String userInput = consola.readLine();
            String[] userInputSplit = userInput.split(" ");
            switch (userInputSplit[0].toLowerCase()) {
                case "addcasa":
                    if (userInputSplit.length == 4) { // Min length 4
                        if (Integer.parseInt(userInputSplit[3]) < 10) { // superficie < 10 ?
                            System.out.println("ERROR: Superficie incorrecta. Ha de ser més gran de 10.");
                        } else {
                            Casa casaAdded = new Casa(userInputSplit[1], userInputSplit[2], Integer.parseInt(userInputSplit[3])); // New casa with all userInputSplit
                            allCasas.add(casaAdded);
                            System.out.println("OK: Casa registrada.");
                        }

                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: addCasa [nif] [nom] [superficie]");
                    }
                    break;

                case "addplaca":
                    if (userInputSplit.length == 5) { //length minima de 5

                        if (Integer.parseInt(userInputSplit[2]) > 0) { // checking if superficie is > than 0

                            if (Integer.parseInt(userInputSplit[3]) > 0) { // checking if preu is > than 0

                                if (Integer.parseInt(userInputSplit[4]) > 0) { // checking if potencia is > than 0
                                    
                                    for (Casa casas : allCasas) {
                                        if (casas.getNif().equals(userInputSplit[1])) {
                                            System.out.println(userInputSplit[1]);
                                        } else {
                                            System.out.println("ERROR: No hi ha cap casa registrada amb aquest nif.");
                                        }
                                    }
                                } else {
                                    System.out.println("ERROR: Potència incorrecte. Ha de ser més gran de 0.");
                                }

                            } else {
                                System.out.println("ERROR: Preu incorrecte. Ha de ser més gran de 0.");
                            }
                        } else {
                            System.out.println("ERROR: Superfície incorrecta. Ha de ser més gran de 0.");
                        }

                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\nÚs: addPlaca [nif] [superficie] [preu] [potència]");
                    }

                    break;

                case "addaparell":
                    if (userInputSplit.length == 4) {
                        System.out.println("addaparell");
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: addAparell [nif] [descripció] [potència]");
                    }

                    break;

                case "oncasa":
                    if (userInputSplit.length == 2) {
                        System.out.println("oncasa");
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: onCasa [nif]");
                    }

                    break;

                case "onaparell":
                    if (userInputSplit.length == 3) {
                        System.out.println("onaparell");
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte \\nÚs: onAparell [nif] [descripció aparell]");
                    }

                    break;

                case "offaparell":
                    if (userInputSplit.length == 3) {
                        System.out.println("offaparell");
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: offAparell [nif] [descripció aparell]");
                    }

                    break;

                case "list":
                    if (userInputSplit.length == 1) {
                        System.out.println("--- Endolls Solars, S.L. ---");
                        System.out.println("Cases enregistrades: " + allCasas.size());
                        System.out.println("");
                        int counter = 1;
                        String interruptor = null;
                        for (Casa casas : allCasas) {
                            if (casas.getInterruptor() == true) {
                                interruptor = "encès";
                            } else {
                                interruptor = "apagat";
                            }
                            System.out.println("Casa " + counter);
                            System.out.println("Client: " + casas.getNif() + " - " + casas.getNom());
                            System.out.println("Superfície de teulada: " + casas.getSuperficie());
                            System.out.println("Superfície disponible: ?");
                            System.out.println("Interruptor general: " + interruptor);
                            System.out.println("Plaques solars instal·lades: ?");
                            System.out.println("Aparells registrats: ?");
                            System.out.println("");

                            counter += 1;
                        }

                        System.out.println("list");
                        System.out.println(allCasas);
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: list");
                    }

                    break;

                case "info":
                    if (userInputSplit.length == 1) {

                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: info [nif]");
                    }

                    break;

                case "quit":
                    if (userInputSplit.length == 1) {
                        programDone = true;
                    } else {
                        System.out.println("ERROR: Número de paràmetres incorrecte.\\nÚs: quit");
                    }

                    break;

                default:
                    System.out.println("Error, el comando '" + userInputSplit[0] + "' no existe");
            }

        } while (programDone != true);

    }
}
