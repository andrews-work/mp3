1. **Basic Layout:**
   - Create 3 layouts (left, right, top)
   - Use buttons in left to switch between views in right
   
2. **Store MP3 Files on App:**
   - Allow users to add existing MP3 files to the app. This involves selecting files and storing their file paths.

3. **Add Data to MP3 File:**
   - You may consider integrating a metadata library or using existing metadata from the MP3 files themselves to extract information like song title, artist, album, etc.

4. **Display Songs in Panel (Visual UI Confirmation):**
   - Populate the UI panels with the relevant information about the added songs.

5. **Play Song:**
   - Use a media player component (e.g., JavaFX's `MediaPlayer`) to play the selected song. Ensure you can handle play/pause, volume control, and seek functionality.

6. **Remove Song:**
   - Allow users to remove songs from the app. Update the UI and, if necessary, handle file deletion or move operations.

7. **Handle File Movement Outside App (Update File Path):**
   - Implement a mechanism to detect changes in file locations. If a file is moved or deleted outside the app, update the file path in your app's data accordingly.

8. **Update UI:**
   - Ensure that changes in the music library (additions, removals, metadata updates) are reflected in the UI in real-time.

9. **Add to Queue, History:**
   - Implement features like adding songs to a playback queue and keeping track of play history.

10. **Playlists:**
    - Allow users to create and manage playlists. This involves selecting specific songs, defining the order, and providing a seamless playback experience.

11. **Error Handling:**
    - Implement robust error handling to manage unexpected scenarios, such as missing files, corrupted metadata, or failed playback.

12. **User Feedback:**
    - Provide feedback to users during operations (adding, removing, playing) through notifications, progress bars, or status messages.

13. **Testing:**
    - Test thoroughly, especially edge cases and scenarios where the app interacts with the user's file system.