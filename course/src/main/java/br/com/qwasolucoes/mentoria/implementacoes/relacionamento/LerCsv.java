package br.com.qwasolucoes.mentoria.implementacoes.relacionamento;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LerCsv {
    public static <T> List<T> lerArquivo(String nomeArquivo, Function<String[], T> mapper) {
    	   List<T> dados = new ArrayList<>();

           try (Reader reader = new InputStreamReader(
                   LerCsv.class.getClassLoader().getResourceAsStream(nomeArquivo));
                CSVReader csvReader = new CSVReader(reader)) {

               String[] header = csvReader.readNext();
               if (header != null) {
               }

               String[] linha;
               while ((linha = csvReader.readNext()) != null) {
                   T item = mapper.apply(linha);
                   if (item != null) {
                       dados.add(item);
                   }
               }
           } catch (IOException | CsvValidationException e) {
               e.printStackTrace();
           }
           return dados;
       }
   }