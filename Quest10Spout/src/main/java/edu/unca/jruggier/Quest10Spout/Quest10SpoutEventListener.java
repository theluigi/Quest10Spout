package edu.unca.jruggier.Quest10Spout;

import org.bukkit.entity.Player;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.weather.*;
import org.getspout.spoutapi.player.SpoutPlayer;




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

public class Quest10SpoutEventListener implements Listener {
	
	@EventHandler

	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		((SpoutPlayer) player).setSkin("http://www.planetminecraft.com/files/resource_media/skin/1219/LegendofZeldaLink.png");
		        
	    }
    }


