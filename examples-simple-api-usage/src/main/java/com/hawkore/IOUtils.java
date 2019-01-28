/**
 * (c) 2018 HAWKORE, S.L. - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * A copy of the license terms has been included with this distribution in the LICENSE.md file.
 * ---
 * Derechos de Autor (C) 2018 HAWKORE, S.L. - Todos los derechos reservados
 * Se prohibe estrictamente la copia sin autorización de este fichero por cualquier medio
 * Propietario y confidencial
 *
 * Se incluye una copia de los términos de la licencia en el archivo LICENSE.md en esta distribución.
 */
package com.hawkore;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOUtils {

    public static String toString(final InputStream is) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        // StandardCharsets.UTF_8.name() > JDK 7
        return result.toString("UTF-8");    }
    
}
