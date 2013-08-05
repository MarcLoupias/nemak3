package fr.nemak3.services;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 20:43
 * To change this template use File | Settings | File Templates.
 */
public class CoreServices {
  private static CoreServicesI instance = new CoreServicesTestImpl();

  public static CoreServicesI getInstance() {
    return instance;
  }

  public static void setCoreServicesImpl(CoreServicesI impl){
    instance = impl;
  }

  private CoreServices(){

  }


}
