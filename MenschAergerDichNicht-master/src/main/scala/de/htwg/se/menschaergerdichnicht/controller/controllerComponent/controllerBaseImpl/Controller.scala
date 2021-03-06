package de.htwg.se.menschaergerdichnicht.controller.controllerComponent.controllerBaseImpl

import com.google.inject.{Guice, Inject}
import de.htwg.se.menschaergerdichnicht.MenschAergerDichNichtModule
import de.htwg.se.menschaergerdichnicht.controller.controllerComponent.ControllerInterface
import de.htwg.se.menschaergerdichnicht.util.{Observable, UndoManager}
import de.htwg.se.menschaergerdichnicht.controller.controllerComponent.GameState._
import de.htwg.se.menschaergerdichnicht.model.fieldComponent.PlayingInterface
import de.htwg.se.menschaergerdichnicht.model.playerComponent.playerBaseImpl.Players

import scala.util._
/**
  * Created by Anastasia on 01.05.17.
  */
case class Controller @Inject() () extends ControllerInterface {

  var players = Players()

  val injector = Guice.createInjector(new MenschAergerDichNichtModule)
  var playingField = injector.getInstance(classOf[PlayingInterface])

  var message = ""
  var gameState: GameState = NONE
  var undoManager = new UndoManager

  def addPlayer(name: String): Try[_] = undoManager.action(AddPlayer(name, this))

  def startGame(): Try[_] = undoManager.action(Play(this))

  def chooseToken(tokenId: Int): Try[_] = undoManager.action(ChooseToken(tokenId, this))

  override def gameStatus: GameState = ???
}