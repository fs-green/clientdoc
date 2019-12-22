package at.clientdoc.frontend.controller;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author fs-green
 * @date 21.12.19
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
@Component
public class GreeterImpl implements Greeter {

    @PostConstruct
    public void init() {
        System.out.println("in PostConstruct");
    }

    @Override
    public String greet(String name) {
        return "Hi " + name + "! Welcome to Spring + JavaFX!";
    }
}
