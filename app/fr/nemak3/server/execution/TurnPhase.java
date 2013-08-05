package fr.nemak3.server.execution;

import org.jetbrains.annotations.NotNull;

public enum TurnPhase {

  INSCRIPTIONS(1, "Phase inscription"),
  SITUATIONS_GENERATION (2, "Phase génération des situations"),
  SITUATIONS_SENDING (3, "Envoi des situations"),
  SITUATIONS_SEND (4, "Situations envoyées"),
  ORDERS_INTEGRATION (5, "Intégration des ordres"),
  ORDERS_EXECUTION (6, "Execution des ordres");

  private final long id;
  @NotNull
  private final String name;

  public long getId() {
    return id;
  }

  @NotNull
  public String getName() {
    return name;
  }

  TurnPhase(long id, @NotNull String name){
    this.id = id;
    this.name = name;
  }


}
