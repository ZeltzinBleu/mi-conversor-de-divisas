package com.aluracursos.conversor.de.divisas.conversor;

import java.util.Map;

public record Conversor(String result,
                        String documentation,
                        String terms_of_use,
                        long time_last_update_unix,
                        String time_last_update_utc,
                        long time_next_update_unix,
                        String time_next_update_utc,
                        String base_code,
                        Map<String, Double> conversion_rates) {

    public Double getConversionRate(String monedaFinal) {
        return conversion_rates.get(monedaFinal);
    }
}

