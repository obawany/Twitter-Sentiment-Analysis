import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.File;

public class CsvArffConverter
{
    public static void Convert(String sourcepath,String destpath) throws Exception
    {
        // load CSV
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("/Users/obawany/Desktop/GItHub Repositories/Twitter-Sentiment-Analysis/semeval_twitter_data.csv"));
        Instances dataSet = loader.getDataSet();

        // save ARFF
        BufferedWriter writer = new BufferedWriter(new FileWriter(destpath));
        writer.write(dataSet.toString());
        writer.flush();
        writer.close(); 
    }

    public static void main(String args[]) throws Exception
    {
        Convert("BSEIT.csv", "test.arff");
    }
}