package edu.unca.jruggier.Quest10Spout;

/*
    This file is part of Quest10Spout

    Foobar is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.logging.Level;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Quest10Spout extends JavaPlugin {

		

	public void onDisable() {
		getLogger().log(Level.INFO, "Plugin disabled.");
	}

	public void onEnable() { 

		getLogger().log(Level.INFO, "SpoutDemo Enabled!");
		saveDefaultConfig();
		new Quest10SpoutEventListener();
	}
}
