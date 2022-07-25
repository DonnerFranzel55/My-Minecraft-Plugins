package de.zygann.pumpkinPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PumpkinPlugin extends JavaPlugin {
	public void authentisierung(int a, int b, int c) {
		this.getLogger().info("Sie werden angemeldet bitte warte einen kleinen Augenblick...");

		int ergebnis = a + b + c;

		this.getLogger().info("" + ergebnis);
	}

	public void printPosition(Location position) {

		double x = position.getX();
		double y = position.getY();
		double z = position.getZ();
		this.getLogger().info("" + x);
		this.getLogger().info(String.format("%s", y));
		this.getLogger().info(String.valueOf(z));
	}

	public int validieren(String[] args) {
		System.out.println("Bitte geben sie eine Zahl ein");
		Integer valueOf = Integer.valueOf(10);

		if (args != null && args.length > 0) {
			String eingabe = args[0];
			Bukkit.broadcastMessage(eingabe); // <- Ausgabe im Minecraft Terminal

			try {
				valueOf = Integer.valueOf(eingabe); // KONVENTIERUNG
				Bukkit.broadcastMessage(String.valueOf(valueOf));

			} catch (NumberFormatException error) {
				String ausgabe = "Das Programm kann Keine Buchstaben/Zeichen verarbeiten(Fehler-Code:00001)";
				System.out.println(ausgabe);
				valueOf = Integer.valueOf(10);
				Bukkit.broadcastMessage(ausgabe);
			}
		}
		return valueOf;

	}

	public void buildWall(Player spieler, Integer valueOf) {
		World welt = spieler.getWorld();
		Location position = spieler.getLocation();
		double y = position.getY();

		for (int j = 0; j < valueOf; j++) {

			position.setZ(position.getZ() + 1);
			welt.getBlockAt(position).setType(Material.DIAMOND_BLOCK);

			for (int k = 0; k < 10; k++) {
				position.setY(position.getY() + 1);
				if ((k == 4 && j == 5) || (k == 5 && j == 5)) {
					welt.getBlockAt(position).setType(Material.AIR);
				} else if ((k == 5 && j == 4) || (k == 4 && j == 4)) {
					welt.getBlockAt(position).setType(Material.AIR);
				} else {
					welt.getBlockAt(position).setType(Material.DIAMOND_BLOCK);
				}
			}
			position.setY(y);
		}

		int a = 10;
		int b = 20;
		int c = 30;
		authentisierung(a, b, c);

	}

	public void onEnable() {
		authentisierung(5, 6, 7);
		this.getLogger().info("startPumpkinPlugin 1.0");
		this.getLogger().info("ANGEMELDET");
		super.onEnable();
	}

	@Override
	public boolean onCommand(CommandSender sender, Command befehl, String befehlsname, String[] args) {
		Player spieler = (Player) sender;
		Location position = spieler.getLocation();
		printPosition(position);

		int bauWert = validieren(args);

		buildWall(spieler, bauWert);

		return true;
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub

		this.getLogger().info("Sie werden abgemeldet...");
		this.getLogger().info("ABGEMELDET");
		this.getLogger().info("finishPumpkinPlugin 1.0");
		super.onDisable();
	}
}
