package com.tenderowls.opensource.match3

sealed trait Direction

object Direction {
  case object Horizontal extends Direction
  case object Vertical extends Direction
}
