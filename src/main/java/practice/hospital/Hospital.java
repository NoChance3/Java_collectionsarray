package practice.hospital;

import java.text.DecimalFormat;
import java.util.regex.Matcher;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] temp = new float[patientsCount];
        for(int i = 0; i< temp.length; i++){
            float value = (float) (32 + Math.random()*8);
            temp[i] = value;
        }

        return temp;
    }

    public static String getReport(float[] temperatureData) {
        float[] a = temperatureData;
        float ba = 0;
        int da = 1;
        String ff = "";
        String tt = "";
        DecimalFormat dF = new DecimalFormat( "#.##" );
        for(int i = 0; i < a.length ; i++){
            ba += a[i];
            if(i == a.length-1){
                ff = ff.concat(String.valueOf(a[i]));
            }
            else{
                ff = ff.concat(String.valueOf(a[i]) +" ");
            }
            if(a[i] >= 36.2 && a[i] <= 36.9){
                da++;
            }
        }

        ba = ba/ a.length;



        String report =
            "Температуры пациентов: " + ff+
            "\nСредняя температура: " + dF.format(ba) +
            "\nКоличество здоровых: " + da;

        return report;
    }
}
