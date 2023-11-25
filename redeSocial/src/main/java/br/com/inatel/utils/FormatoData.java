package br.com.inatel.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatoData {
    public static String dataFormatoSql(String dataOriginal) {

        // Parse a string para um objeto Date
        SimpleDateFormat dateFormatOriginal = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = dateFormatOriginal.parse(dataOriginal);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Formatando a data no novo formato
        SimpleDateFormat dateFormatNovo = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = dateFormatNovo.format(data);

        return dataFormatada;
    }

    public static String dataFormatoExibir(String dataOriginal) {
        // Parse a string para um objeto Date
        SimpleDateFormat dateFormatOriginal = new SimpleDateFormat("yyyy-MM-dd");
        Date data = null;
        try {
            data = dateFormatOriginal.parse(dataOriginal);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Formatando a data no novo formato
        SimpleDateFormat dateFormatNovo = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormatNovo.format(data);

        return dataFormatada;
    }
}
