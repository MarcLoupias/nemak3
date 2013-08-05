package fr.nemak3.core.mission;

import fr.nemak3.tools.Nemak3ConfigFile;
import org.apache.commons.configuration.ConfigurationException;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 23/06/13
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */
public class MissionExecutorConfig extends Nemak3ConfigFile {




  public MissionExecutorConfig(String path) throws ConfigurationException {
    super(path);
  }

  public MissionExecutorConfig(File f) throws ConfigurationException {
    super(f);
  }

  @Override
  protected void load() throws ConfigurationException {
    config.load();
    /*this.galaxyName = config.getString("galaxy-generator.galaxyName");
    this.nbSectors = config.getInt("galaxy-generator.nbSectors");*/
  }

  @Override
  protected void save() throws ConfigurationException {
    /*config.clear();
    configLayout.setHeaderComment("galaxy-generator config file");
    config.setProperty("galaxy-generator.galaxyName", this.galaxyName);
    config.setProperty("galaxy-generator.nbSectors", this.nbSectors);
    config.save();*/
  }
}
