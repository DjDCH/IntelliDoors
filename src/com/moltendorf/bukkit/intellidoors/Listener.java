package com.moltendorf.bukkit.intellidoors;

import org.bukkit.Material;

/**
 * Listener callback interface.
 *
 * @author moltendorf
 */
interface Listener extends org.bukkit.event.Listener {
	Handler make(final Set_FenceGate set, final boolean open);
	Handler make(final Set_Trap set, final boolean open);
	Handler make(final Material material, final Set_Door_Single set, final boolean open);
	Handler make(final Material material, final Set_Door_Double set, final boolean open, final boolean side);
}
