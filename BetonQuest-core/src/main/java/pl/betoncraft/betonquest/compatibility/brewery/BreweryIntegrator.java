/*
 * BetonQuest - advanced quests for Bukkit
 * Copyright (C) 2016  Jakub "Co0sh" Sapalski
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.betoncraft.betonquest.compatibility.brewery;

import pl.betoncraft.betonquest.BetonQuest;
import pl.betoncraft.betonquest.compatibility.Integrator;

public class BreweryIntegrator implements Integrator {

    private BetonQuest plugin;

    public BreweryIntegrator() {
        plugin = BetonQuest.getInstance();
    }

    @Override
    public void hook() {
        plugin.registerEvents("givebrew", GiveBrewEvent.class);
        plugin.registerEvents("takebrew", TakeBrewEvent.class);

        plugin.registerConditions("drunk", DrunkCondition.class);
        plugin.registerConditions("drunkquality", DrunkQualityCondition.class);
        plugin.registerConditions("hasbrew", HasBrewCondition.class);

    }

    @Override
    public void reload() {

    }

    @Override
    public void close() {

    }
}
