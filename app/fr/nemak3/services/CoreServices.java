package fr.nemak3.services;

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
