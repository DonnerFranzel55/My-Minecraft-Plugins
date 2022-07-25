package de.zygann.plusEinsPlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class PlusEinsPlugin extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command command, String commandName, String[] args) {
		System.out.println("Bitte geben sie eine Zahl ein");
		String eingabe = args[0];
		Bukkit.broadcastMessage(eingabe); // <- Ausgabe im Minecraft Terminal
		try {
			Integer valueOf = Integer.valueOf(eingabe); // KONVENTIERUNG
			valueOf = valueOf + 1; // Addieerd die eingegebende Zahl +1
			Bukkit.broadcastMessage(String.valueOf(valueOf));
			
		} catch (NumberFormatException error) {
			String ausgabe = "Das Programm kann Keine Buchstaben/Zeichen verarbeiten(Fehler-Code:00001)";
			System.out.println(ausgabe);
			
			Bukkit.broadcastMessage(ausgabe);
		}

		return true;
	}
}
