package com.jtunisie.osgi.scala.impl


class Service (message: String)extends TService {
  def getMessage()={
    message
  }
  def init()={
    println( message);
  }
}
