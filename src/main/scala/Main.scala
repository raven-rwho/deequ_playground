/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession
import com.amazon.deequ.VerificationSuite

object Main {
  def main(args: Array[String]) {
    val logFile = "/Users/pkrauss/Documents/notes/convokit.md" // Should be some file on your system
    val spark = SparkSession
      .builder
      .appName("Simple Application")
      .master("local[4]")
      .getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}