DeftIDEA
========

This is an experimental plugin for IntelliJ to provide IDE-like
functionality.

Getting Started
---------------

Developing the plugin requires that you have the IntelliJ community
edition source code and various plugins installed. These are required
if you are modifying the lexers or parsers. Otherwise, you can use
the generated versions of the files that we have committed.

Currently, the easiest way is to follow the `tutorial for writing
a custom language plugin <http://confluence.jetbrains.com/display/IntelliJIDEA/Prerequisites>`_.

Be sure to also disable the external compiler via the *Settings → Compiler
→ Use external build* option.

To run the plugin in a separate IntelliJ IDEA instance you need to add a run
configuration. To do this open the *Run/Debug Configurations* window (via *Run
→ Edit Configurations...*), click the *+* button and choose *Plugin*. You can
rename your configuration to a more descriptive name such as *"DeftIDEA"*.
