package MyCheckNormalizer;
import java.util.Objects;

public class Normaliser {

    public String normalise(String strTest){

        System.out.println("Checking : " + strTest);
        String[] jobTitlesList = {"Architect", "Software engineer", "Quantity surveyor",  "Accountant"};
        int[] resultados_q = new int[] {0, 0, 0, 0}; // ranking for 'q'
        float[] resultados_q_f = new float[] {0, 0, 0, 0}; // ranking for 'q'
        String line = strTest;
        String[] wordsInput = line.toUpperCase().split(" "); // input string in parts
        String[] jobTitleAnalysis; // job title
        int qtdWordsPercent = 100 / wordsInput.length ; // qtdWordsPercent = % / words
        String result;
        System.out.println(qtdWordsPercent);
        float q = 0;
        int m = 0;
        for(m=0; m < jobTitlesList.length; m++ ){ // index
            System.out.println("analysisng job title : " + jobTitlesList[m]);
            String dataString = jobTitlesList[m];
            jobTitleAnalysis = dataString.toUpperCase().split(" "); // job title in parts // i could use a kind of 'test every char on the string to be more detailed.' // however i already have a given array
            for(String strJobTile: jobTitleAnalysis){
                for(String strInput:wordsInput){
                    if(Objects.equals(strJobTile, strInput)){
                        resultados_q[m] = qtdWordsPercent;
                        q = (float)qtdWordsPercent / 100; // use q to fill the requirements
                        resultados_q_f[m] = q;
                        // if(qtdWordsPercent == 100){
                        if(q >= 1.0){
                            System.out.println("The 100% match is:qtdWordsPercent == 100: "+jobTitlesList[m]);
                            System.out.println("best match: "+jobTitlesList[m] + " " + (float)qtdWordsPercent / 100 );
                            result = jobTitlesList[m];
                            return result;
                        }
                        // System.out.println("add to q : " + resultados_q[m]);
                        // System.out.println("add to qf : " + resultados_q_f[m]);
                    }
                }
            }
        }
        float d = 0, comp1f = 0, comp2f = 0;
        int best = 0, comp1 = 0, comp2 = 0, cnt = 0, cntMax = resultados_q.length -1;
        for (cnt = 0; cnt < cntMax; cnt ++) {
            comp1f = resultados_q_f[cnt];
            comp2f = resultados_q_f[cnt +1];// use q to fill the requirements
            if (comp1f > comp2f){
                best = cnt;
                d = best;
                q = (float)best / 100;
                System.out.println("The best ranking is: "+resultados_q[cnt]);
                break; // 1st found
            }else{
                best = cnt;
                d =  best;
                q = (float)best / 100;
                System.out.println("The best ranking is: "+resultados_q[cnt]);
            }
        }

        System.out.println("best match: "+jobTitlesList[cnt] + " value: " + q);
        result = jobTitlesList[cnt];
        return result;
    }

    


}
