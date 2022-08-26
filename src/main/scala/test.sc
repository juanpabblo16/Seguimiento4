class BinaryText() {
  def solution(record: String, start: Int, last: Int): Unit = {
    if (start == last) {
      print(" " + record + " \n");
      return;
    }
    solution(record + '0'.toString(), start + 1, last);
    solution(record + '1'.toString(), start + 1, last);
  }

  def binaryString(n: Int): Unit = {
    if (n <= 0) {
      return;
    }
    print(" Digit : " + n + " \n");
    this.solution("", 0, n);
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var task: BinaryText = new BinaryText();
    task.binaryString(4);
  }
}