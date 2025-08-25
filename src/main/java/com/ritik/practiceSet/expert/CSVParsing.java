package com.ritik.practiceSet.expert;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

class CrimeData {
    private final int SlNo;
    private final String State_UT;
    private final float n2020;
    private final float n2021;
    private final float n2022;
    private final float midYearProjectedPopulation;
    private final float rateOfCognizableCrimes;
    private final float chargeSheetRate;

    public CrimeData(int slNo, String state_UT, float n2020, float n2021, float n2022,
                     float midYearProjectedPopulation, float rateOfCognizableCrimes, float chargeSheetRate) {

        SlNo = slNo;
        State_UT = state_UT;
        this.n2020 = n2020;
        this.n2021 = n2021;
        this.n2022 = n2022;
        this.midYearProjectedPopulation = midYearProjectedPopulation;
        this.rateOfCognizableCrimes = rateOfCognizableCrimes;
        this.chargeSheetRate = chargeSheetRate;
    }

    @Override
    public String toString() {
        return "CrimeData{" +
                "SlNo=" + SlNo +
                ", State_UT='" + State_UT + '\'' +
                ", n2020=" + n2020 +
                ", n2021=" + n2021 +
                ", n2022=" + n2022 +
                ", midYearProjectedPopulation=" + midYearProjectedPopulation +
                ", rateOfCognizableCrimes=" + rateOfCognizableCrimes +
                ", chargesheetRate=" + chargeSheetRate +
                '}';
    }
}

public class CSVParsing {
    public static void main(String[] args) throws IOException {
        String csvFilePath = "src/main/java/com/ritik/practiceSet/expert/csv/NCRB_Table.csv";
        File file = new File(csvFilePath);

        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        List<CrimeData> list;
        try (Stream<String> stream = Files.lines(file.toPath())) {
            list = stream.skip(1)
                    .map(line -> line.split(","))
                    .map(stateData ->
                            new CrimeData(
                                    Integer.parseInt(stateData[0]),
                                    stateData[1],
                                    Float.parseFloat(stateData[2]),
                                    Float.parseFloat(stateData[3]),
                                    Float.parseFloat(stateData[4]),
                                    Float.parseFloat(stateData[5]),
                                    Float.parseFloat(stateData[6]),
                                    Float.parseFloat(stateData[7])
                            )).toList();
        }
        
        if (list.isEmpty()) {
            System.out.println("No data found");
            return;
        }

        for (CrimeData crimeData : list) {
            System.out.println(crimeData);
        }


    }

    void readFile(File file) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value.trim() + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}