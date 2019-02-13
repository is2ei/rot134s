package com.is2ei.rot13

import org.scalatest._

class EncoderSpec extends FlatSpec {
  assert(Rot13.encode("ABCDEFGHIJKLM") == "NOPQRSTUVWXYZ")
  assert(Rot13.encode("NOPQRSTUVWXYZ") == "ABCDEFGHIJKLM")
  assert(Rot13.encode("abcdefghijklm") == "nopqrstuvwxyz")
  assert(Rot13.encode("nopqrstuvwxyz") == "abcdefghijklm")
}
