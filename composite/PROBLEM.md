# Escenario: Sistema de Gestión de Archivos

## Descripción:

Imagina que estás desarrollando un sistema de gestión de archivos para una empresa de tecnología que necesita organizar y manipular una gran cantidad de archivos y carpetas. El sistema debe permitir a los usuarios crear, eliminar, mover y buscar archivos y carpetas de manera eficiente.

## Objetivo:

Implementar el patrón de diseño Composite para representar tanto archivos individuales como carpetas que contienen archivos y otras carpetas, y permitir operaciones de gestión de archivos de manera uniforme en toda la estructura de archivos.

## Requisitos:

1. Definir una interfaz ComponenteArchivo que declare métodos comunes para archivos y carpetas, como agregar(ComponenteArchivo), eliminar(ComponenteArchivo), obtenerNombre(), etc.
2. Implementar una clase Archivo que represente un archivo individual con métodos para operaciones específicas de archivos, como leer(), escribir(), eliminar(), etc.
3. Implementar una clase Carpeta que represente una carpeta que contiene archivos y otras carpetas. La clase Carpeta debe contener una lista de ComponenteArchivo y proporcionar métodos para operaciones de gestión de carpetas, como agregar(ComponenteArchivo), eliminar(ComponenteArchivo), etc.
4. Permitir que los usuarios realicen operaciones de gestión de archivos en archivos individuales y carpetas, como crear, eliminar, mover y buscar archivos y carpetas, de manera uniforme a través de la interfaz ComponenteArchivo.
5. Demostrar el uso del patrón Composite en el sistema de gestión de archivos mediante ejemplos de creación de archivos y carpetas, realización de operaciones de gestión de archivos en la estructura de archivos y navegación por la estructura de archivos.