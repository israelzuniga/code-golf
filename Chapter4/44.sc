class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte) = sum += b

  def cehcksum() = ~(sum & 0xFF) + 1
}


val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator



acc.sum = 3