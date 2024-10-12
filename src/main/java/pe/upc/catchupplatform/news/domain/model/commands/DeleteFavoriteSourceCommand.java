/**
 * DeleteFavoriteSourceCommand command
 *
 * @Summary
 * The DeleteFavoriteSourceCommand is a command object that encapsulates the data needed
 * to delete a favorite news source from the system. It requires the API key to authenticate
 * the user and the source ID to identify the favorite source to be removed. The command ensures
 * that both the API key and the source ID are not null or empty before proceeding with the deletion.
 */

package pe.upc.catchupplatform.news.domain.model.commands;

public record DeleteFavoriteSourceCommand(String newsApiKey, String sourceId) {
    public DeleteFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
    }
}
