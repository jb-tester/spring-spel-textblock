# https://youtrack.jetbrains.com/issue/IDEA-360100
SpEL expression in the text block:
the bean member reference is not treated as usage
(member is shown as unused, rename doesn't update the usages in SpEL).
However, the completion/navigation in SpEL works as expected.

if the single-line string is used, then the reference is recognized