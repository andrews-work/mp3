the gui was working fine when i ran 'mvn javafx:run' then i updated the operating system on my computer and now i get this error below, any help is welcome.

chatGPT:
"The first warning suggests that your application is waiting for reactivation but is timing out. This could be related to how your application handles events or threads, but it's hard to say for certain without seeing your code.

The second error is more critical and is the one causing your application to crash. It's an NSInternalInconsistencyException thrown because the system is trying to remove a tracking rectangle with an invalid NSTrackingRectTag (0x0). As I mentioned earlier, this could be due to the tag being truncated to 32bit at some point, or because the tracking rectangle has already been removed."