/*
 * Copyright © 2014 - 2015 Alexander01998 and contributors
 * All rights reserved.
 * 
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package tk.wurst_client.chat;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class ChatMessenger
{
	private boolean enabled = true;
	
	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}
	
	public void message(String message)
	{
		if(enabled)
			Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(
				new ChatComponentText("§c[§6Wurst§c]§f " + message));
	}
	
	public void info(String message)
	{
		message("§7[§6§lWurst X§7] (info)§f " + message);
	}
	
	public void debug(String message)
	{
		message("§7[§6§lWurst X§7] (debug)§f " + message);
	}
	
	public void warning(String message)
	{
		message("§7[§6§lWurst X§7] (warning)§f " + message);
	}
	
	public void error(String message)
	{
		message("§7[§6§lWurst X§7] (error)§f " + message);
	}
	
	public void success(String message)
	{
		message("§7[§6§lWurst X§7] (success)§f " + message);
	}
	
	public void failure(String message)
	{
		message("§7[§6§lWurst X§c] (failure)§f " + message);
	}
	
	public void cmd(String message)
	{
		Minecraft.getMinecraft().ingameGUI.getChatGUI().printChatMessage(
			new ChatComponentText("§7[§6Wurst§7]§f §0§l<§aCMD§0§l>§f "
				+ message));
	}
}
