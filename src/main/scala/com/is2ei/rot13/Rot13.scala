package com.is2ei.rot13

object Rot13 {
  def encode(s: String): String = s.map(c => encode(c.toInt).toChar)

  def encode(n: Int): Int = {
    if (n < 78) {
      n + 13
    } else if (n > 74 && n < 93) {
      n - 13
    } else if (n > 96 && n < 110) {
      n + 13
    } else if (n > 109 && n < 123) {
      n - 13
    } else {
      n
    }
  }
}