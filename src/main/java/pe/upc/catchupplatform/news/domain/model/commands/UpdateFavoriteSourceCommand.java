/**
 * UpdateFavoriteSourceCommand command
 *
 * @Summary
 * The UpdateFavoriteSourceCommand is a command object that encapsulates the data needed
 * to update a favorite news source in the system. It includes the API key to authenticate
 * the user, the current source ID to identify the source to be updated, and the new source ID
 * to replace the old one. This command ensures that none of the provided values are null or empty.
 */
package pe.upc.catchupplatform.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(String newsApiKey, String sourceId, String newSourceId) {
    public UpdateFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
        if (newSourceId == null || newSourceId.isEmpty())
            throw new IllegalArgumentException("NewSourceId cannot be null or empty");
    }
}
